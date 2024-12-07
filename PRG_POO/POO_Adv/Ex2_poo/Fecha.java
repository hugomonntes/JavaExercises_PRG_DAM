package PRG_POO.POO_Adv.Ex2_poo;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    //#region SET & GET
    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31 ) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (dia < 1 || dia > 31 ) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }
    //#endregion
    //#region CONSTRUCTORES
    public Fecha(){
        dia = 17;
        mes = 8;
        año = 2023;
    }

    public Fecha(Fecha dia, Fecha mes, Fecha año){
        this.dia = 17;
        this.mes = 8;
        this.año = 2023;
    }
    //#endregion
    //#region MÉTODOS
    public String fechaFormateada(boolean formatoFecha){
        if (formatoFecha) {
            return "";
        } else {
            return "";
        }
    }

    public static int diferenciaFechas(Fecha a, Fecha b){
        return a.getAño() - a.getAño();
    }
    //#endregion
}
