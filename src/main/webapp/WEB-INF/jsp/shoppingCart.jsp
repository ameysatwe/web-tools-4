<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 28/10/24
  Time: 5:18 pm
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shopping Cart</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }
        .form-container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 400px;
            position: sticky;
            top: 0;
            z-index: 1000;
        }
        button {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #0056b3;
        }
        .cart-container {
            margin-top: 50px;
            padding: 30px;
            width: 600px;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }
        div {
            margin-bottom: 15px;
            display: flex;
            align-items: center;
        }
        p{
            margin: 10px;
        }

        /* Styling the checkboxes */
        input[type="checkbox"] {
            width: 20px;
            height: 20px;
            margin-right: 10px;
            accent-color: #007bff; /* Changing the color of selected checkboxes */
        }

        /* Styling the labels */
        label {
            font-size: 16px;
            font-family: Arial, sans-serif;
        }

        /* Styling on hover */
        input[type="checkbox"]:hover {
            cursor: pointer;
            transform: scale(1.1); /* Slight zoom on hover */
            transition: transform 0.2s ease;
        }

        /* Checked state style */
        input[type="checkbox"]:checked {
            transform: scale(1.2); /* Slight zoom on selection */
            transition: transform 0.2s ease;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>Shopping Cart</h1>

    <form method="post">
        <div>
            <input type="checkbox" id="Laptop" name="product" value="Laptop" />
            <label for="Laptop">Laptop</label>
        </div>

        <div>
            <input type="checkbox" id="tv" name="product" value="Television" />
            <label for="tv">Television</label>
        </div>

        <div>
            <input type="checkbox" id="CPU" name="product" value="CPU" />
            <label for="CPU">CPU</label>
        </div>

        <div>
            <input type="checkbox" id="phone" name="product" value="Phone" />
            <label for="phone">Phone</label>
        </div>

        <div>
            <input type="checkbox" id="charger" name="product" value="Charger" />
            <label for="charger">Charger</label>
        </div>

        <div>
            <input type="checkbox" id="lamp" name="product" value="Lamp" />
            <label for="lamp">Lamp</label>
        </div>

        <div>
            <input type="checkbox" id="fan" name="product" value="Fan" />
            <label for="fan">Fan</label>
        </div>

        <div>
            <input type="checkbox" id="headphones" name="product" value="Headphones" />
            <label for="headphones">Headphones</label>
        </div>

        <div>
            <input type="checkbox" id="keyboard" name="product" value="Keyboard" />
            <label for="keyboard">Keyboard</label>
        </div>



        <button type="submit" name="action" value="add">Add to Cart</button>
        <button type="submit" name="action" value="remove">Remove from Cart</button>
    </form>
</div>

<div class="cart-container">
    <h2>Your Cart</h2>
    <c:if test="${not empty products}">
        <ul>
            <c:forEach var="product" items="${products}">
                <li>${product}</li>
            </c:forEach>
        </ul>
    </c:if>
    <c:if test="${empty products}">
        <p>Your cart is currently empty.</p>
    </c:if>
</div>
</body>
</html>
