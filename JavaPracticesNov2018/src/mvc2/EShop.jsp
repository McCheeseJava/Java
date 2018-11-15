<%@ page session="true" %>
<html>
<head>
  <title>Music Without Borders</title>
</head>
<body bgcolor="#33CCFF">
  <font face="Times New Roman,Times" size="+3">
    Music Without Borders
  </font>
  <hr><p>
  <center>
  <form name="shoppingForm" 
    action="/examples/servlet/ShoppingServlet" 
    method="POST">
  <b>CD:</b> 
  <select name=CD>
    <option>Yuan | The Guo Brothers | China | $14.95</option>
    <option>Drums of Passion | Babatunde Olatunji | Nigeria | $16.95</option>
    <option>Kaira | Tounami Diabate| Mali | $16.95</option>
    <option>The Lion is Loose | Eliades Ochoa | Cuba | $13.95</option>
    <option>Dance the Devil Away | Outback | Australia | $14.95</option>
    <option>Record of Changes | Samulnori | Korea | $12.95</option>
    <option>Djelika | Tounami Diabate | Mali | $14.95</option>
    <option>Rapture | Nusrat Fateh Ali Khan | Pakistan | $12.95</option>
    <option>Cesaria Evora | Cesaria Evora | Cape Verde | $16.95</option>
    <option>Ibuki | Kodo | Japan | $13.95</option>
  </select>
  <b>Quantity: </b><input type="text" name="qty" SIZE="3" value=1>
  <input type="hidden" name="action" value="ADD">
  <input type="submit" name="Submit" value="Add to Cart">
  </form>
  </center>
  <p>
  <jsp:include page="Cart.jsp" flush="true" />
</body>
</html>