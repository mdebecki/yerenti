package com.yerenti.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.yerenti.bean.MenuItem;

public class XMLContent {

	private ArrayList<MenuItem> menuList;

	public List<MenuItem> getMenuList() {

		menuList = new ArrayList();
		MenuItem menItem = new MenuItem();

		MenuItem menItemSub = new MenuItem();

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("/resources/content/menu.xml").getFile());
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();

			NodeList nListCategory = doc.getDocumentElement().getChildNodes();

			for (int i = 0; i < nListCategory.getLength(); i++) {

				Node node = nListCategory.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName() == "name") {
					// do something with the current element
					menItem = new MenuItem();
					menItem.setName(node.getTextContent());
					menItem.setChildItems(new ArrayList());
					menuList.add(menItem);
				}
				if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName() == "subcategory") {
					// do something with the current element

					menItemSub = new MenuItem();
					for (int j = 0; j < node.getChildNodes().getLength(); j++) {

						if (node.getNodeType() == Node.ELEMENT_NODE
								&& node.getChildNodes().item(j).getNodeName() == "name") {
							menItemSub.setName(node.getChildNodes().item(j).getTextContent());
						}
						if (node.getNodeType() == Node.ELEMENT_NODE
								&& node.getChildNodes().item(j).getNodeName() == "url") {
							menItemSub.setURL(node.getChildNodes().item(j).getTextContent());
						}
					}

					menuList.get(menuList.size() - 1).getChildItems().add(menItemSub);
				}

			}

		} catch (ParserConfigurationException | SAXException |

		IOException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menuList;

	}
}
