public class Printer {
    private int tonerLevel;
    int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        this.tonerLevel=((tonerLevel>=0)&&(tonerLevel<=100))?this.tonerLevel:-1;
        this.pagesPrinted=0;
        this.duplex=duplex;
    }

    public int addToner(int tonerAmount) {
        if((tonerAmount>0)&&(tonerAmount<=100)) {
            int tempTonerLevel=tonerLevel+tonerAmount;
            if(tempTonerLevel>100){
                return -1;
            }else {

                return tempTonerLevel;
            }
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if(duplex){
            pages=(pages/2)+(pages%2);
            pagesPrinted+=pages;
        }else{
            pagesToPrint=pages;
        }
        pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
