//Muhammad Mi'raj Rizky
//123200080
package tugas_123200080;

import com.sun.org.apache.bcel.internal.classfile.ConstantFieldref;

public class Konversi {
    float celcius;

    public Konversi(float celcius) {
        this.celcius = celcius;
    }
    
    float fahrenheit(){
        return (4*this.celcius)/5;
    }
    float reamur(){
        return (9*this.celcius)/5 + 32;
    }
    float kelvin(){
        return (float) (this.celcius + 273.15);
    }
}
