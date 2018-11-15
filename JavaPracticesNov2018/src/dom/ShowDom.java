package dom;


//http://www.tutorialized.com/tutorial/DOM-and-Java/5944

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

public class ShowDom {

    public static void main (String args[]) {
        File docFile = new File("/Users/anassiry/eclipse-workspace/JavaPracticesNov2018/src/dom/candy.xml");

        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(docFile);
        } catch (java.io.IOException e) {
            System.out.println("Can't find the file");
        } catch (Exception e) {
            System.out.print("Problem parsing the file.");
        }


        Element root = doc.getDocumentElement();

        NodeList products = root.getElementsByTagName("product");

				           Element productElement;
				           for (int productNum = 0; productNum < products.getLength(); productNum++)
				           {
				               productElement = (Element)products.item(productNum);

				               productElement.setAttributeNode(doc.createAttribute("productNumber"));
				               productElement.setAttribute("productNumber", ("Product " + productNum));

				               String productName = productElement.getFirstChild().getNodeValue();
				               productElement.getFirstChild().setNodeValue(productName.toUpperCase());

				               Element updateElement = doc.createElement("updated");
				               java.util.Date rightNow = new java.util.Date();
				               Node updateText = doc.createTextNode(rightNow.toString());

				               updateElement.appendChild(updateText);
				               productElement.appendChild(updateElement);
        }




	        System.out.println("The root element is " + root.getNodeName() + ".\n");

	        NodeList children = root.getChildNodes();
	        System.out.print("There are "+children.getLength()+" child elements.\n");
	        System.out.print("They are: \n");

	        for (Node child = root.getFirstChild();
	             child != null;
	             child = child.getNextSibling())
	        {
	            if (child.getNodeType() == child.TEXT_NODE){
	                 System.out.println("Text: "+child.getNodeValue());
	            } else if (child.getNodeType() == child.ELEMENT_NODE) {
	                 System.out.println(child.getNodeName()+" = "+
	                          child.getFirstChild().getNodeValue());
	            }

	       }










	    }
	}



