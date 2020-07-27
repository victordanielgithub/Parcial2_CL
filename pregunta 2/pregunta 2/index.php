<?php
echo "CONSUMIENDO WEB-SERVICE DE .NET<br>";
echo "===============================";
echo '<br><br><br>';
try{
    $soapclient = new SoapClient('http://localhost:20766/WebService.asmx?wsdl');
    $response = $soapclient->PersonaPostgreSQL();
    var_dump($response);

    echo '<br>';

    $array = json_decode(json_encode($response), true);
    print_r($array);

    echo '<br>>';
    

    foreach($array as $item){
        echo '<pre>';
        var_dump($item);
    }


} catch(Exception $e){
    echo $e->getMessage();
}


echo 'CONSUMIENDO WEB-SERVICE DE .JAVA';
echo '<br>';
echo '================================';
echo '<br><br><br>';
try{
    $soapclient = new SoapClient('http://localhost:8080/SWPersonaCBD/NewWebService?wsdl');
    $response = $soapclient->conexionPostgreSQL();
    var_dump($response);

    echo '<br>';

    $array = json_decode(json_encode($response), true);
    print_r($array);

    echo '<br>';
    

    foreach($array as $item){
        echo '<pre>';
        var_dump($item);
    }


} catch(Exception $e){
    echo $e->getMessage();
}


?>