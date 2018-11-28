package manager;

public enum BrowserType {


    CHROME("Chrome",1),
    FIREFOX("Firefox",2),
    IE("InternetExplorer",3);


    private String type;
    private int numberOfBrowser;

    BrowserType(String type,int numberOfBrowser){
        this.type = type;
        this.numberOfBrowser = numberOfBrowser;

    }

    public int getNumberOfBrowser(){
        return numberOfBrowser;
    }


}
