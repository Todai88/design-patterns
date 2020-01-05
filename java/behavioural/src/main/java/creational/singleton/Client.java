package main.java.creational.singleton;

public class Client {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.getInstance("http://localhost");
        System.out.println(httpClient.createUrl("tester"));
        System.out.println(httpClient.createUrl("testWithParams", "test1=one", "test2=two"));
    }
}
