
package maininterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFunctions extends Remote{
    //Función para crear espacio virtual en el disco
    String create(int pSize) throws RemoteException;
    //Función para obtener la ubicacion actual en el directorio
    String getActualPath(String root) throws RemoteException;
    //Función para crear un directorio
    int mkdir(String pName,String pRoot, boolean pOverride) throws RemoteException;
    //Función cd
    boolean cd(String pNewPath,String pRoot) throws RemoteException;
    //Funcion para crear un archivo en el directorio actual
    int createFile(String pFileNamePath, String pContent, String pPath, String pRoot, boolean pOverride) throws RemoteException;
    //Funcion ls lista todos los archivos y directorios del directorio actual
    String ls(String pRoot) throws RemoteException;
    //Funcion mv: mueve un archivo o directorio hacia otro lugar o 
    // si se mueve a su mismo directorio se cambia el nombre
    boolean mv(String[] params, String pRoot) throws RemoteException;
    //Función para mostrar el contenido de un archivo
    String cat(String[] filenames, String pRoot) throws RemoteException;
    //Función para eliminar uno o varios archivos, así como directorios
    boolean rm(String[] filenames, boolean isDir, String pRoot) throws RemoteException;
    //Función para mostrar el tamaño de un directorio o archivo
    int du(String pName, String pRoot) throws RemoteException;
    //Función para buscar archivos o directorios y mostrar su ruta
    String find(String pName, String pRoot) throws RemoteException;
    //Función que genera una arbol simulando la estructura de archivos a partir del directorio actual
    String tree(String pRoot) throws RemoteException;
    //Función para copiar archivos o directorios
    boolean cpy(String[] paths, int type, String root) throws RemoteException;

    
}
