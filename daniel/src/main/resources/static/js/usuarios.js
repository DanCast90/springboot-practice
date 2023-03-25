// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#tabla-usuarios').DataTable();
    loadUsers();
});


async function loadUsers(){

  const request = await fetch('getU/2344', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();
  console.log(usuarios);


}