package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        PROBLEMA:
        Crear un programa que le pida al usuario los datos de un trabajador así:
        El número de horas trabajadas en el mes, el valor de la hora, la cantidad de años que tiene de laborar en la empresa.
        El algoritmo le debe mostrar: El salario bruto mensual, el valor de la bonificación ($30.000 por cada año laborado),
        el valor de las deducciones mensuales (8% sobre el salario bruto) y el salario neto mensual.
         */

        // Instanciar Clases
        Scanner scanner = new Scanner(System.in);

        // Datos de Entrada
        int horasTrabajadasMes;
        float valorHora;
        byte anosLaborados;

        // Datos de Salida
        float salarioBruto;
        int bonificacion;
        float deduccion;
        float salarioNeto;

        // Constantes
        final int BONIFICACION_POR_ANIO = 30000;
        final float PORCENTAJE_DEDUCCION = 0.08f;

        // Ingreso de Información

        System.out.print("\nIngrese el número de horas trabajadas en el mes: ");
        horasTrabajadasMes = scanner.nextInt();

        System.out.print("\nIngrese el valor por hora: ");
        valorHora = scanner.nextFloat();

        System.out.print("\nIngrese los años laborados en la empresa: ");
        anosLaborados = scanner.nextByte();

        // Proceso
        salarioBruto = horasTrabajadasMes * valorHora;
        bonificacion = anosLaborados * BONIFICACION_POR_ANIO;
        deduccion = salarioBruto * PORCENTAJE_DEDUCCION;
        salarioNeto = salarioBruto + bonificacion - deduccion;

        // Datos a Mostrar

        System.out.println("\n--- Resumen de Pago ---");
        System.out.printf("Salario bruto mensual: $%.2f%n", salarioBruto);
        System.out.printf("Bonificación por años: $%,d%n", bonificacion);
        System.out.printf("Deducciones (8%%): $%.2f%n", deduccion);
        System.out.printf("Salario neto mensual: $%.2f%n", salarioNeto);

    }
}
