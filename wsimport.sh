wsdluri='http://zvezdochetkz.appspot.com/CalculatorService.wsdl'
gensrcdir='./src'
targetpackage='kz.zvezdochet.soap.client'
genoutdir='./war/WEB-INF/classes'
wsimport -d "$genoutdir" -s "$gensrcdir" -p $targetpackage -keep "$wsdluri"