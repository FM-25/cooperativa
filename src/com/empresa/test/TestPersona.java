/*package com.empresa.test;

import java.util.ArrayList;
import java.util.List;

import com.empresa.dao.PersonaDao;
import com.empresa.entities.Beneficiario;
import com.empresa.entities.Cliente;
import com.empresa.entities.Direccion;
import com.empresa.entities.Persona;
import com.empresa.entities.Referencia;
import com.empresa.entities.Telefono;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona = new Persona();//cliente
		persona.setNombre("Luis");
		persona.setApellido("Escobar");
		persona.setNumeroDocumento("d2-f23fsd2343");
		
		List<Cliente> cliList = new ArrayList<Cliente>();
		Cliente cli = new Cliente();
		cli.setEsMiembro("1");
		cli.setPersona(persona);
		cliList.add(cli);
		
		List<Telefono> telList = new ArrayList<Telefono>();
		Telefono telCli =  new Telefono();
		telCli.setTelefono("22223-22131");
		telCli.setPersona(persona);
		telList.add(telCli);
		telCli = new Telefono();
		telCli.setTelefono("220121-1231");
		telCli.setPersona(persona);
		telList.add(telCli);
		
		
		List<Direccion> dirList = new ArrayList<Direccion>();
		Direccion dir = new Direccion();
		dir.setDireccion("Direccion uno");
		dir.setPersona(persona);
		dirList.add(dir);
		
		persona.setDireccions(dirList);
		persona.setTelefonos(telList);
		persona.setClientes(cliList);
		
		//guardando persona
		
		PersonaDao perDao = new PersonaDao();
		Persona perRest = perDao.insertPersona(persona);
		System.out.println("id persona insertada :"+perRest.getIdPersona());
		
		
		//beneficiarios
		
		
		List<Beneficiario> benList = new ArrayList<Beneficiario>();
		Beneficiario ben =  new Beneficiario();
		Persona perBen = new Persona();
		perBen.setNombre("Ben nombre 1");
		perBen.setApellido("Ben Ape 1");
		perBen.setNumeroDocumento("111111111");
		Persona respuestaPerBen = perDao.insertPersona(perBen);
		ben.setPersona(respuestaPerBen);
		ben.setCliente(persona.getClientes().get(0));
		ben.setParentesco("padre");
		ben.setPorcentaje(100);
		benList.add(ben);
		cli.setBeneficiarios(benList);
		String respuestaBen = perDao.insertEbenficiarios(benList);
		System.out.println("Repuesta beneficiarios " +respuestaBen);
		
		//referencias
		
		List<Referencia> refList = new ArrayList<Referencia>();
		Referencia ref = new Referencia();
		Persona perRef = new Persona();
		perRef.setNombre("Ref Nombre 01");
		perRef.setApellido("Ref Apellido 1");
		perRef.setNumeroDocumento("88888888");
		Persona respuestaPerRef = perDao.insertPersona(perRef);
		ref.setPersona(respuestaPerRef);
		ref.setCliente(persona.getClientes().get(0));
		refList.add(ref);
		cli.setReferencias(refList);
		String respuestaRef = perDao.insertReferencias(refList);
		System.out.println("Repuesta referencia" + respuestaRef);
		
		
	}

}
*/