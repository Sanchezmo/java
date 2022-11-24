package ejercicio3empresaDptos;

public interface IEmpresa {

	/***********************************ALTA DE DEPARTAMENTO**************************************/

	void alta();

	/***********************************INTRODUCIR Y VALIDAR  CÓDIGO DE DPTO*****************************************/
	int introducirCodDpto();

	IDepartamento buscar(int codDpto);

	IDepartamento buscarNb(String nbDpto);

	/***********************************INSERTAR DPTO EN EL ARRAY DE DEPARTAMENTOS*****************************************/

	void insertarDpto(IDepartamento dpto);

	/************************************ASIGNAR EMPLEADO AL DPTO**************************************/

	void asignarEmpDpto();

	/***********************************INTRODUCIR Y VALIDAR  CÓDIGO DE EMPLEADO*****************************************/
	int introducirCodEmpl(int numeroEmp);

	/************************************LISTAR DPTO**************************************/

	void listarDpto();

	void borrar();

	/***********************************BAJA DE UN DPTO EN EL EMPRESA***************************************/

	void bajaDpto(IDepartamento dpto);

	/************************************BUSCAR UN EMPLEADO EN UN DPTO**************************************/

	void buscarEmpDptoCod();

	/************************************BUSCAR UN EMPLEADO EN UN DPTO  POR NOMBRE**************************************/

	void buscrEmpDptoNombre();

	/************************************INCREMENTAR SUELDO DE UN EMPLEADO **************************************/

	void incremSueldoEmpl();

	/************************************BORRAR UN EMPLEADO DE UN DPTO**************************************/

	void borrarEmpl();

	/***********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO**************************/

	void mayorSueldoDpto();

	/***********************************EMPLEADO DE MAYOR SUELDO EN LA EMPRESA**************************/
	void mayorSueldo();

}