package PRG_POO.POO_Adv.Ex2_poo;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // #region SET & GET
    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }

    // #endregion
    // #region CONSTRUCTORES
    public Fecha() {
        dia = 17;
        mes = 8;
        año = 2023;
    }

    public Fecha(int dia, int mes, int año) {
        setAño(año);
        setMes(mes);
        setDia(dia);
    }

    // #endregion
    // #region MÉTODOS
    public String fechaFormateada(boolean formatoFecha) {
        String fechaMod = "";
        if (formatoFecha) {
            return dia + "/" + mes + "/" + año;
        } else {
            // Realizar SWITCH para localizar el mes en cada caso.
            switch (mes) {
                case 1:
                    return fechaMod = getDia() + " de Enero " + getAño();
                case 2:
                    return fechaMod = getDia() + " de Febrero " + getAño();
                case 3:
                    return fechaMod = getDia() + " de Marzo " + getAño();
                case 4:
                    return fechaMod = getDia() + " de Abril " + getAño();
                case 5:
                    return fechaMod = getDia() + " de Mayo " + getAño();
                case 6:
                    return fechaMod = getDia() + " de Junio " + getAño();
                case 7:
                    return fechaMod = getDia() + " de Julio " + getAño();
                case 8:
                    return fechaMod = getDia() + " de Agosto " + getAño();
                case 9:
                    return fechaMod = getDia() + " de Septiembre " + getAño();
                case 10:
                    return fechaMod = getDia() + " de Octubre " + getAño();
                case 11:
                    return fechaMod = getDia() + " de Noviembre " + getAño();
                case 12:
                    return fechaMod = getDia() + " de Diciembre " + getAño();
            } 
            return fechaMod;
        }
    }

    public static int diferenciaFechas(Fecha a, Fecha b) {
        if (a.getAño() > b.getAño()) {
            return a.getAño() - b.getAño();
        } else {
            return b.getAño() - a.getAño();
        }
    }
    // #endregion
}
