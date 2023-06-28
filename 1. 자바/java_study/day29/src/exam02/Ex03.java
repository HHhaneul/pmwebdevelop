package exam02;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://n.news.naver.com/mnews/article/009/0005148566?sid=103");

        String protocol = url.getProtocol();
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();
        String ref = url.getRef();

        System.out.printf("protocol = %s%n host = %s%n path = %s%n query = %s%n ref = %s%n", protocol, host, path, query, ref);
    }
}
