let Math = {
  piConst: 3.14159265358979323846264338327950288,
  
  absOper: function(num) {
    if (num < 0) {
      num *= -1;
    }
    return num;
  },
  
  powerOper: function(num, ex) {
    num **= ex;
  return num;
  },
  
  rootOper: function(num, radIndex) {
    radIndex = this.powerOper(radIndex, -1);
    num = this.powerOper(num, radIndex);
    return num;
  }
};
