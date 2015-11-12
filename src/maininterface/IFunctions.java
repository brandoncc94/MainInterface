
package maininterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFunctions extends Remote{
    //Función para crear espacio virtual en el disco
    String create(int pSize) throws RemoteException;
    //Función para obtener la ubicacion actual en el directorio
    String getPath(String root) throws RemoteException;
    //Función para crear un directorio
    boolean mkdir(String pName,String pRoot) throws RemoteException;
    //Función cd
    boolean cd(String pNewPath,String pRoot) throws RemoteException;
    //Funcion para crear un archivo en el directorio actual
    boolean createFile(String pFileName,String pContent,String pPath,String pRoot) throws RemoteException;
    //Funcion ls lista todos los archivos y directorios del directorio actual
    String ls(String pRoot) throws RemoteException;
    //Funcion mv: mueve un archivo o directorio hacia otro lugar o 
    // si se mueve a su mismo directorio se cambia el nombre
    boolean mv(String[] params, String pRoot) throws RemoteException;
    //Función para mostrar el contenido de un archivo
    String cat(String[] filenames, String pRoot) throws RemoteException;
    
}
