package org.knit.Task2;

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


