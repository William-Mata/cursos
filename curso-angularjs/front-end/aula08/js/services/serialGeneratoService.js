angular.module("ListaTelefonica").provider("serialGenerator", function (){
        
    this._length = 10;

    this.getLength = () => {
        return this._length
    }

    this.setLength = (length) => {
        this._length = length;
    }

    this.$get = () => {
            return {
                generate : () => {
                    var serial = ""
                    do{
                        serial += String.fromCharCode(Math.floor(Math.random() * 64) + 32);
             
                     }while(serial.length <= this._length);

                     return serial;
                }
            }
    }
}); 