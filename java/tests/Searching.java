package tests;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Part2_Cast;
import pages.Result_page;

public class Searching extends TestBase{
	
	HomePage home_object;
	Result_page result_object;
	Part2_Cast part2_result;
	
	@Test
	public void godfather() throws InterruptedException {
		home_object = new HomePage(driver);
		result_object = new Result_page(driver);
		part2_result = new Part2_Cast(driver);
		home_object.txt_search.sendKeys("godfather wikipedia");
		home_object.txt_search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		result_object.godfather_Wiki.click();
		Thread.sleep(2000);
		part2_result.cast.click();
		Thread.sleep(2000);
		String casting = part2_result.all_of_them3.getText();
		// Create a new Swing window
		JFrame frame = new JFrame("Paragraph Text");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
	    // Create a text area to display the text
        JTextArea textArea = new JTextArea(casting);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        // Add the text area to a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        // Add the scroll pane to the content pane of the frame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// Make the frame visible
		frame.setVisible(true);
		while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
	}
	

}
