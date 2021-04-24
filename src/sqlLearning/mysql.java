package sqlLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mysql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		String database = "/qadbt";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + database, "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employeeinfo where name = 'sita';");
		while (rs.next()) {

			System.out.println(rs.getString("name"));
			driver.findElement(By.id("username")).sendKeys(rs.getString("name"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("location"));

		}
		con.close();
	}

}
