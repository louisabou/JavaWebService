package test;

import java.rmi.RemoteException;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		
		BanqueServiceProxy proxy = new BanqueServiceProxy();
		System.out.println(proxy.conversionEuroToXOF(900));
		Compte compte = proxy.getCompte(3);
		System.out.println("code= "+compte.getCode());
		System.out.println("solde= "+compte.getSolde());
		Compte[] cptes = proxy.listComptes();
		for (Compte cp:cptes)
		{
			System.out.println("---------------------");
			System.out.println("code= "+cp.getCode());
			System.out.println("solde= "+cp.getSolde());
		}

	}

}
