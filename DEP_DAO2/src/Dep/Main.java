/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dep;



/**
 *
 * @author rodri
 */
public class Main {
     public static void main(String[] args){
        DAOFactory factoryNeodaty = new NeodatisDAOFactory();
        DAOFactory factory = new SqlDbDAOFactory();
        DepartamentoDAO dpto = factory.getDepartamentoDAO();
        EmpleadoDAO emp = factory.getEmpleadoDAO();

        DepartamentoDAO dptoN = factoryNeodaty.getDepartamentoDAO();
        EmpleadoDAO empN = factoryNeodaty.getEmpleadoDAO();
       /* /////////////////////////////SQL/////////////////////////////////
        //INSERTAR EMPLEADO 
        Empleado empAux = new Empleado(1,"Perez","RRHH",12,"03/05/2019",1200.0,1);
        emp.InsertarEmp(empAux);
        System.out.println(emp.ConsultarEmp(2).getApellido());

        //MODIFICAR EMPLEADO
        Empleado empAux2 = new Empleado(1, "Rendon", "Desarrollador", 12,"03/05/2000", 400.0, 1);
        emp.ModificarEmp(1, empAux2);
        System.out.println("\n" + emp.ConsultarEmp(1).getApellido());

            //ELIMINAR EMPLEADO
        emp.EliminarEmp(15);

        //INSERTAR DEPARTAMETNO 
        Departamento dptoAux = new Departamento(2, "RRHH", "Albacete");
        dpto.InsertarDep(dptoAux);

       //ELIMINAR DEPARTAMENTO 
        dpto.EliminarDep(5);*/

        //////////////////////////////////NEODATI////////////////////
        System.out.println("\nNEODATIS\n");

        //INSERTAR DEPARTAMENTO
        Departamento NdepartAux = new Departamento(29, "RPA", "Huelva");
        dptoN.InsertarDep(NdepartAux);

        Empleado empAuxn = new Empleado(3, "Perez", "Analista", 11, "03/05/1999", 400.0, 29);
        empN.InsertarEmp(empAuxn);

        //MODIFICAR EMPLEADO
        Empleado empAux2n = new Empleado(3, "Jimenez", "Analista", 10, "03/12/1999", 420.0, 29);
        empN.ModificarEmp(3, empAux2n);
        System.out.println("\nEMPLEADO MOIDICADO NUEVO APELLIDO: " + empN.ConsultarEmp(3).getApellido() + "\n");

            //ELIMINAR EMPLEADO
        empN.EliminarEmp(3);

         //INSERTAR DEPARTAMENTO SIN EMPLEADO A CARGO 
        Departamento NdepartAux2 = new Departamento(3, "Salesforce", "Sevilla");
        dptoN.InsertarDep(NdepartAux2);

          //ELIMINAR DEPARTAMENTO
        dptoN.EliminarDep(3);
    }
}
