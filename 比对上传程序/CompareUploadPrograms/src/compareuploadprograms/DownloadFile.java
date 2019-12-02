/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sun.net.www.http.HttpClient;

/**
 *
 * @author elvislee
 */

public class DownloadFile {
    
    
    
    public static void main(String[] args) throws MalformedURLException {
       String actionUrl="http://172.17.0.90/MES.WIP.Webservice/FTService.asmx/GetComponent?sBarcodeNo=J9B6010000";
       String fileName=actionUrl.substring(actionUrl.lastIndexOf("?"));
       String filePath="f:";
       File file=saveUrlAs(actionUrl,filePath,"GET");
        System.out.println(file.getAbsolutePath());
       ParseXml("F:/CompareUploadPrograms/log.xml");
    }

    private static File saveUrlAs(String url, String filePath, String method) {
        File file=new File(filePath);
        if(!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fileOut=null;
        HttpURLConnection conn=null;
        InputStream inputStream=null;
        
        try {
            URL httpUrl=new URL(url);
            conn= (HttpURLConnection) httpUrl.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(method);
            
            conn.connect();
            inputStream=conn.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(inputStream);
            
            if(filePath.endsWith("/")){
               filePath+="/";
            }
            fileOut=new FileOutputStream(filePath+"log.xml");
            BufferedOutputStream bos=new BufferedOutputStream(fileOut);
            
            byte[]buf=new byte[4096];
            int length=bis.read(buf);
            
            while(length!=-1){
                bos.write(buf,0,length);
                length=bis.read(buf);
            }
            bos.close();
            bis.close();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return file;
    }
    public static void ParseXml(String path){
        try{
            File file=new File(path);
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(file);
            String str=doc.getDocumentElement().getFirstChild().getNodeValue();
            System.out.println(str);
            if(str.equals("[]")){
                System.out.println("False");
            }else{
                System.out.println("True");
            }
            //System.out.println(str.substring(2, str.length()-2));
        }catch(Exception e){
           e.printStackTrace();
        }
       
    }
}
