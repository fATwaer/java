package c7;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class LoggingImageViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (System.getProperty("java.util.logging.config.class") == null
				&& System.getProperty("java.util.loggin.config.file") == null)
		{
			try {
				Logger.getLogger("local.corejava").setLevel(Level.ALL);
				final int LOG_ROTATION_COUNT = 10;
				Handler handler = new FileHandler("LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
				Logger.getLogger("local.corejava").addHandler(handler);
			} catch (IOException e) {
				Logger.getLogger("local.corejava").log(Level.SEVERE, 
						"can't create log file handler", e);
			}
		}
		
		
		
		EventQueue.invokeLater(()->
				{
					Handler windowHandler = new WindowHandler();
					windowHandler.setLevel(Level.ALL);
					Logger.getLogger("local.corejava").addHandler(windowHandler);
					Logger.getLogger("local.corejava").log(Level.INFO, "window open successfully");
					
					JFrame frame = new ImageViewerFrame();
					frame.setTitle("LoggingImageViewer");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Logger.getLogger("local.corejava").fine("Showing frame");
					frame.setVisible(true);
					
				});
	}

}

class WindowHandler extends StreamHandler
{
	private JFrame frame;
	
	public WindowHandler() {
		frame = new JFrame();
		final JTextArea output = new JTextArea();
		output.setEditable(false);
		frame.setSize(600, 400);
		frame.add(new JScrollPane(output));
		frame.setFocusableWindowState(false);
		frame.setVisible(true);
		setOutputStream(new OutputStream()
				{
					public void write(int b) {
						
					}
					
					public void write(byte[] b, int off, int len) {
						output.append(new String(b, off, len));
					}
				});
	}
	
		public void publish(LogRecord record){
			if (!frame.isVisible()) return;
			super.publish(record);
			flush();
		}
	
}


class ImageViewerFrame extends JFrame
{
	private static final int DEFAULT_WIDTH = 667;
	private static final int DEFAULT_HEIGHT = 500;
	
	private JLabel label;
	private static Logger logger = Logger.getLogger("local.corejava");
	
	public ImageViewerFrame() {
		logger.entering("ImageViewrFrame", "<init>");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new FileOpenListener());
		
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event) 
					{
						logger.fine("Exiting.");
						System.exit(0);
					}
				});
		
		label = new JLabel();
		add(label);
		logger.exiting("ImageViewerFrame", "<init>");
		
		
	}
	
	private class FileOpenListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event);
			
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
					{
						public boolean accept(File f) {
							return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
						}

						@Override
						public String getDescription() {
							// TODO Auto-generated method stub
							return "GIF Images";
						}
					});
			int r = chooser.showOpenDialog(ImageViewerFrame.this);
			
			if (r == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				logger.log(Level.FINE, "reading file {0}", name);
				label.setIcon(new ImageIcon(name));
			} else 
				logger.fine("FIile open dialog canceled");
				logger.exiting("ImageViewerFrame.FileOpenListener", "actionPerformed");
			
		}
	}
}









