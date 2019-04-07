package controlador;

public interface IControlador {
	
	//Login
	public void loginToHome();
	
	//Home
	public void homeToLogin(); //Boton Salir
	public void homeToInfoExtra();
	public void homeToInformes();
	public void homeToGestion();
	public void homeToOcupaciones();
	public void homeToPerfil();
	
	//Gestion
	public void gestionToPerfil();
	public void gestionToGestionarUsuarios();
	public void gestionToGestionarRegistros();
	public void gestionToGestionarActividades();
	public void gestionToGestionarAsignatura();
	public void gestionToGestionarAlumnos();
	public void gestionToGestionarProfesores();
	public void gestionToGestionarActores();
	public void gestionToGestionarSalas();
	public void gestionToVerGrupos();
	public void gestionToGestionarAcad();
	public void gestionToHome();
	
	//Informes
	public void informesToHome();
	public void informesToPerfil();
	
	//Informacion Extra
	public void infoExtraToHome();
	public void infoExtraToPerfil();
	
	//Crear Usuario
	public void crearUsuarioToPerfil();
	public void crearUsuarioToGestionUsuarios();
	
	//Gestion Usuarios
	public void gestionUsuariosToGestion();
	public void gestionUsuariosToPerfil();
	public void gestionUsuariosToCrearUsuario();
	
	//Gestion Acad
	public void gestionAcadToGestion();
	public void gestionAcadToPerfil();
	
	//Gestion Actividad
	public void gestionActividadToGestion();
	public void gestionActividadToPerfil();
	
	//Gestion Actores
	public void gestionActoresToGestion();
	public void gestionActoresToPerfil();
	
	//Gestion Alumnos
	public void gestionAlumnosToGestion();
	public void gestionAlumnosToPerfil();
	
	//Gestion Registros
	public void gestionRegistrosToGestion();
	public void gestionRegistrosToPerfil();
	
	//Gestion Asignatura
	public void gestionAsignaturaToGestion();
	public void gestionAsignaturaToPerfil();
	
	//Gestion Profesores
	public void gestionProfesoresToGestion();
	public void gestionProfesoresToPerfil();
	
	//Gestion Salas
	public void gestionSalasToGestion();
	public void gestionSalasToPerfil();
	
	//Ver Grupos
	public void verGruposToGestion();
	public void verGruposToPerfil();
	
	//Perfil
	public void perfilToHome();
	

}
