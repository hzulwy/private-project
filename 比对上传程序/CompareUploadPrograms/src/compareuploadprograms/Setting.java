/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

/**
 *
 * @author dell
 */
public class Setting {
    private String ServerIP;
    private String ID;
    private String Point;
    private String Line;
    private String log_path;
    private String toMES_path;
    private String num;
    private String path;
   

    public String getServerIP() {
        return ServerIP;
    }

    public String getID() {
        return ID;
    }

    public String getPoint() {
        return Point;
    }

    public String getLine() {
        return Line;
    }

    public String getLog_path() {
        return log_path;
    }

    public String getToMES_path() {
        return toMES_path;
    }

    public String getNum() {
        return num;
    }

    public String getPath() {
        return path;
    }

    public void setServerIP(String ServerIP) {
        this.ServerIP = ServerIP;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPoint(String Point) {
        this.Point = Point;
    }

    public void setLine(String Line) {
        this.Line = Line;
    }

    public void setLog_path(String log_path) {
        this.log_path = log_path;
    }

    public void setToMES_path(String toMES_path) {
        this.toMES_path = toMES_path;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Setting() {
         ServerIP="";
         ID="";
         Point="";
         Line="";
         log_path="";
         toMES_path="";
         num="";
         path="";
    }
    
    
}
