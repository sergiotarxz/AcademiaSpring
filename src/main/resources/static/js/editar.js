function editar(id, nombre, apellidos, telefono, email, dni) {
	document.getElementById('modalEdit').querySelector('[id=\'id\']').value = id;
	document.getElementById('modalEdit').querySelector('[id=\'nombre\']').value = nombre;
	document.getElementById('modalEdit').querySelector('[id=\'apellidos\']').value = apellidos;
	document.getElementById('modalEdit').querySelector('[id=\'telefono\']').value = telefono;
	document.getElementById('modalEdit').querySelector('[id=\'email\']').value = email ;
	document.getElementById('modalEdit').querySelector('[id=\'dni\']').value = dni;
}
