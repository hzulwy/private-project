/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author dell
 */
public class ReadXmlFile {
    List<String>case_list;
    String path;

    public ReadXmlFile(String path) {
        this.path=path;
    }
    
    
    
    //读取xml文件中的测试数据，返回list集合
  
    public List  XmlToList_key(String path) throws Exception {
         case_list=new ArrayList<>(); 
         File xmlFile = new File(path);          
         DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();  
         DocumentBuilder builder = builderFactory.newDocumentBuilder();   
         Document doc = builder.parse(xmlFile);  
         doc.getDocumentElement().normalize();
         System.out.println("Root element: "+doc.getDocumentElement().getNodeName()); 
         NodeList nList = doc.getElementsByTagName("TestItem");
   
         for(int i = 0 ; i<nList.getLength();i++){
   
             Node node = nList.item(i);   
             System.out.println("Node name: "+ node.getNodeName());
             Element ele = (Element)node;
   
            // System.out.println("----------------------------");
             if(node.getNodeType() == Element.ELEMENT_NODE){
   
                // System.out.println("case id: "+ ele.getAttribute("id"));
                 if(ele.getAttribute("Key")!=""){
                     case_list.add(ele.getAttribute("Key"));
                 }else if(ele.getAttribute("key")!=""){
                     case_list.add(ele.getAttribute("key"));
                 }
                 
   
                 //System.out.println("case name: "+ ele.getElementsByTagName("name").item(0).getTextContent());
                // case_list.add(ele.getElementsByTagName("name").item(0).getTextContent());
   
                // System.out.println("devicesId: "+ele.getElementsByTagName("devicesId").item(0).getTextContent());
                // case_list.add(ele.getElementsByTagName("devicesId").item(0).getTextContent());

   
                
                // System.out.println("-------------------------");
   
   
             }
   
   
         }
         return case_list;

     }
 
 
 public List  XmlToList_casename(String path) throws Exception {
        case_list=new ArrayList<>();
    
         File xmlFile = new File(path);
           
         DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

         DocumentBuilder builder = builderFactory.newDocumentBuilder();

         Document doc = builder.parse(xmlFile);

         doc.getDocumentElement().normalize();

         System.out.println("Root element: "+doc.getDocumentElement().getNodeName());

         NodeList nList = doc.getElementsByTagName("TestItem");

         for(int i = 0 ; i<nList.getLength();i++){

             Node node = nList.item(i);

             System.out.println("Node name: "+ node.getNodeName());
             Element ele = (Element)node;

            // System.out.println("----------------------------");
             if(node.getNodeType() == Element.ELEMENT_NODE){

                // System.out.println("case id: "+ ele.getAttribute("id"));
                 //case_list.add(ele.getAttribute("id"));

                 //System.out.println("case name: "+ ele.getElementsByTagName("name").item(0).getTextContent());
                 case_list.add(ele.getTextContent());

                // System.out.println("devicesId: "+ele.getElementsByTagName("devicesId").item(0).getTextContent());
                // case_list.add(ele.getElementsByTagName("devicesId").item(0).getTextContent());


                
                // System.out.println("-------------------------");


             }


         }
         return case_list;

     }
 

 public List  XmlToList_devicesid() throws Exception {
         case_list=new ArrayList<>(); 
         File xmlFile = new File("src/Testcase.xml");       
         DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = builderFactory.newDocumentBuilder();
         Document doc = builder.parse(xmlFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("case");
         for(int i = 0 ; i<nList.getLength();i++){

             Node node = nList.item(i);
             System.out.println("Node name: "+ node.getNodeName());
             Element ele = (Element)node;

            // System.out.println("----------------------------");
             if(node.getNodeType() == Element.ELEMENT_NODE){

                // System.out.println("case id: "+ ele.getAttribute("id"));
                 //case_list.add(ele.getAttribute("id"));

                 //System.out.println("case name: "+ ele.getElementsByTagName("name").item(0).getTextContent());
                // case_list.add(ele.getElementsByTagName("name").item(0).getTextContent());

                // System.out.println("devicesId: "+ele.getElementsByTagName("devicesId").item(0).getTextContent());
                 case_list.add(ele.getElementsByTagName("devicesId").item(0).getTextContent());


                
                // System.out.println("-------------------------");

             }
         }
         return case_list;
     }
 }