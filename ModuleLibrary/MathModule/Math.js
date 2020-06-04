const Math = {
  abs = (num) => {
    if (num < 0) {
      num *= -1;
    } else {
      return num;
    }
  }
  
  pow = (num, ex) => {
    num **= ex;
  }
  
  root = (num, radIndex) => {
    radIndex = this.pow(radIndex, -1);
    num = this.pow(num, radIndex);
  }
};
