package screenshots;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot 
{
	public void FullScreenshot() throws AWTException, IOException
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://mail.google.com/mail/u/0/#inbox");
		Robot robot=new Robot();
		java.awt.Dimension sourcefile=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(sourcefile);
		BufferedImage image=robot.createScreenCapture(rectangle);
		File destinationfile=new File("D://FullScreenshot.png");
		ImageIO.write(image,"png", destinationfile);
		
	}
	public static void main (String[]args) throws IOException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://github.com/jackson927/Automation-analyst-assignment/settings/pages");
		org.openqa.selenium.TakesScreenshot screen=(org.openqa.selenium.TakesScreenshot)d;
		File sourcefile=screen.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("D://Half-screenshot.jpg");
		FileHandler.copy(sourcefile, destinationfile);;
		
	}

}
