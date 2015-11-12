
package maininterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFunctions extends Remote{
    //Función para crear espacio virtual en el disco
    String create(int pSize) throws RemoteException;
    //Función para obtener la ubicacion actual en el directorio
    String getPath(String root) throws RemoteException;
    //Función para crear un directorio
    void mkdir(String pName,String pRoot) throws RemoteException;
    //Función cd
    boolean cd(String pNewPath,String pRoot) throws RemoteException;
}
