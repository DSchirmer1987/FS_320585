package network_dozent.sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;

public class MySocketClass {
	public static void socketInformationen() {
		try {
			
			Socket socket = new Socket("195.190.9.30", 80);
			
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println(socket.getPort());
			System.out.println(socket.getLocalSocketAddress());
			System.out.println(socket.getInetAddress());
			System.out.println(socket.getSoTimeout());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void inetInformation() {
		try {
			InetAddress ip = InetAddress.getByName("www.github.com");
			System.out.println(ip.getCanonicalHostName());
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			System.out.println(ip.toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void networkInterfaces() throws SocketException {
		Collections.list(NetworkInterface.getNetworkInterfaces()).forEach(
					ni -> {
						System.out.println("NetworkInterface "+ ni.getIndex() +": " + ni.getDisplayName());
						for(InetAddress ip : Collections.list(ni.getInetAddresses())) {
							System.out.println("\tCanonicalHostname: " + ip.getCanonicalHostName());
							System.out.println("\tIP:                " + ip.getHostAddress());
							System.out.println("\tLoopback?          " + ip.isLoopbackAddress());
							System.out.println("\tSiteLocal?         " + ip.isSiteLocalAddress());
						}
					}
				);
	}
}
