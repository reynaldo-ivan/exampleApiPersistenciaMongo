package mx.com.anzen.persistencia.mongo.exampleApiPersistenciaMongo;

import java.util.HashMap;
import java.util.Map; 
import mx.com.anzen.operaciones.imple.Operaciones;

/**
 * Para realizar la conexión a la base de datos tenemos un archivo properties
 * Donde vamos a ingresar la ip y el puerto para la conexion a la base de datos.
 * @author anzen
 *
 */
 
public class App 
{
	public static void main(String[] args) {
		Operaciones operaciones=new Operaciones();
		/**
		 * Para ingresar los datos debemos de crear un Map armar el mapa e ingresarlo
		 */
		Map<String,Object> map=new HashMap();
//		map.put("id",1); 
//		map.put("nombre","reynaldo ivan");
//		map.put("am","martinez");
//		map.put("ap","lopez");
		/**
		 * Realiza el alta
		 * nos pide como parametros los siguientes datos.
		 * - Nombre de la base de datos
		 * - Nomnbre de la tabla
		 * - Mapa que vamos a mandar 
		 */
//		String result=operaciones.alta("rey","persona",map);
//		System.out.println("resultados  "+result); 
		/**
		 * Realiza el consulta
		 * nos pide como parametros los siguientes datos.
		 * - Nombre de la base de datos
		 * - Nomnbre de la tabla
		 * - Mapa que vamos a mandar
		 * NOTA: si no deseas realizar la busqueda con parametros debes de mandar el mapa vacio
		 */
		Map<String,Object> mapResult=operaciones.consulta("rey","persona",map);
		System.out.println("Result   "+mapResult);
		  
	}
}
