package org.knit.lab1;

public class Task2 {
    public void execute() {
        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        String protocol = urlValue.substring(0, urlValue.indexOf(':'));
        String point = urlValue.substring(urlValue.indexOf("://") + 3);
        String address = point.split("/")[0];
        String domain = address.contains(".") ? address.substring(0, address.lastIndexOf(".")) : address;
        String domainExtension = address.contains(".") ? address.substring(address.lastIndexOf(".") + 1) : "";
        String pathWithQuery = point.split("\\?", 2)[0];
        String path = pathWithQuery.split("/", 2).length > 1 ? pathWithQuery.split("/", 2)[1] : "";
        String fileName = "";
        String fileExtension = "";
        if (path.contains("/")) {
            String[] pathParts = path.split("/");
            String lastPart = pathParts[pathParts.length - 1];
            if (lastPart.contains(".")) {
                fileName = lastPart.substring(0, lastPart.lastIndexOf("."));
                fileExtension = lastPart.substring(lastPart.lastIndexOf(".") + 1);
            } else {
                fileName = lastPart;
            }
        }
        SimpleUrl simpleUrl = new SimpleUrl();
        simpleUrl.setProtocol(protocol);
        simpleUrl.setAddress(address);
        simpleUrl.setDomainZone(domainExtension);
        simpleUrl.setSiteName(domain);
        simpleUrl.setWebpageName(fileName);
        simpleUrl.setWebPageExtension(fileExtension);

        System.out.println(simpleUrl);
    }
}

class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    public void setWebPageExtension(String webPageExtension) {
        this.webPageExtension = webPageExtension;
    }

    @Override
    public String toString() {
        return "SimpleUrl{" +
                "protocol='" + protocol + '\'' +
                ", address='" + address + '\'' +
                ", domainZone='" + domainZone + '\'' +
                ", siteName='" + siteName + '\'' +
                ", webpageName='" + webpageName + '\'' +
                ", webPageExtension='" + webPageExtension + '\'' +
                '}';
    }
}
