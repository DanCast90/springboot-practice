// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#tabla-usuarios').DataTable();
    loadUsers();
});


async function loadUsers(){

  const request = await fetch('getUs', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();
  let listadoHTML='';
  usuarios.forEach(element => {
    let users=' <tr><td>'+element.id+'</td><td>'+element.nombre+' '+element.apellido+
    '</td><td>'+element.email+'</td><td>'+element.telefono+
    '</td><td><a class="btn btn-warning btn-circle btn-sm mr-1">'+
    '<i class="fas fa-pen"></i></a><a class="btn btn-danger btn-circle btn-sm">'+
    '<i class="fas fa-trash"></i></a></td></tr>';
    listadoHTML+=users;
  });
  document.querySelector('#tabla-usuarios tbody').outerHTML = listadoHTML;;
 

}