
package spambot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SpamBot {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;
 
		Robot robot = new Robot();
		Scanner scanner = new Scanner(System.in);
 
		System.out.println("Enter your text:");
		String Text = scanner.nextLine();
 
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
 
		System.out.println("The spamming will start in 10 seconds");
		Thread.sleep(10000);
 
		while(x <= 500) {
 
			Thread.sleep(500);
 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
 
		x++;
 
		}
 
	}
 
}
