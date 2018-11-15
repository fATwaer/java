package c6;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit Program");
		System.exit(0);
	}

}


//CLASS TALKINGCLOCK
//{
//	PRIVATE INT INTERVAL;
//	PRIVATE BOOLEAN BEEP;
//	
//	
//	PUBLIC TALKINGCLOCK(INT INTERVAL, BOOLEAN BEEP) {
//		THIS.INTERVAL = INTERVAL;
//		THIS.BEEP = BEEP;
//	}
//	
//	PUBLIC VOID START()  {
//		ACTIONLISTENER LISTENER = NEW TIMEPRINTER();
//		TIMER T = NEW TIMER(INTERVAL, LISTENER);
//		T.START();
//	}
//	
//	// INNER CLASS
//	PUBLIC CLASS TIMEPRINTER IMPLEMENTS ACTIONLISTENER {
//
//		@OVERRIDE
//		PUBLIC VOID ACTIONPERFORMED(ACTIONEVENT E) {
//			SYSTEM.OUT.PRINTLN("AT THE TONE, TIME IS "+NEW DATE());	
//		}
//		
//	}
//	
//	
//	
//}