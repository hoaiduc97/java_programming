package lab_6;

public class Lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        // Check protocol
        if(url.contains("https")){
            System.out.println("Protocol is https");
        } else if (url.contains("http")) {
            System.out.println("Protocol is http");
        }
        // Check domain
        if(url.endsWith("com")){
            System.out.println("Domain is .com");
        }else if (url.endsWith("net")){
            System.out.println("Domain is .net");
        }
    }
}
