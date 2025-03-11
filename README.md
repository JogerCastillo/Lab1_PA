# Laboratorio Programación Avanzada 01

## DESCRIPCIÓN DEL PROBLEMA:
El sistema bancario requiere gestionar varios productos financieros, cada uno con características específicas. Los productos incluyen:
Cuenta de Ahorro: Permite a los clientes ahorrar dinero y genera intereses mensuales basados en un porcentaje de interés.

### Cuenta Corriente:
Ofrece un saldo y permite sobregiros, con un interés mensual aplicado al saldo.

### Certificado de Depósito a Término (CDT):
Un producto de inversión con un plazo fijo y un interés mensual que se calcula al finalizar el plazo.

### Tarjeta de Crédito:
Permite a los clientes utilizar un cupo preaprobado, con intereses mensuales aplicados al valor utilizado.

Cada producto debe calcular sus intereses de manera específica, lo que requiere un diseño flexible y extensible.

## Explicación del codigo:

*La clase Client* emerge como el núcleo central de identificación, consolidando los atributos esenciales de representación individual: documento de identificación, nombre, contacto y localización geográfica.

<br/>

*La clase abstracta ProductBank* constituye el elemento arquitectónico fundamental, estableciendo un modelo de herencia que define un contrato estructural para los productos financieros. Esta abstracción permite una implementación genérica de atributos y comportamientos comunes, facilitando la extensibilidad y mantenimiento del sistema.

<br/>

*Los productos financieros derivados* - CreditCard, CDT, CurrentAccount y SavingsAccount - representan especializaciones que implementan comportamientos específicos mientras mantienen una estructura base común. Cada especialización introduce características particulares que responden a diferentes necesidades financieras: gestión de intereses, manejo de cuotas, capacidad de sobregiro, estrategias de acumulación entre otras.
