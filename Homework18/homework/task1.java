package Homework18.homework;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
public class task1 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("homework18/homework/input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList authorList = doc.getElementsByTagName("author");
            Node authorNode = authorList.item(0);
            Element authorElement = (Element) authorNode;

            String lastName = authorElement.getElementsByTagName("lastName").item(0).getTextContent();
            String firstName = authorElement.getElementsByTagName("firstName").item(0).getTextContent();
            String title = doc.getElementsByTagName("title").item(0).getTextContent();

            NodeList linesList = doc.getElementsByTagName("line");

            StringBuilder content = new StringBuilder();
            for (int i = 0; i < linesList.getLength(); i++) {
                Node lineNode = linesList.item(i);
                content.append(lineNode.getTextContent()).append("\n");
            }

            String fileName = firstName + "_" + lastName + "_" + title + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write(content.toString());
            writer.close();

            System.out.println("File " + fileName + " has been created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
