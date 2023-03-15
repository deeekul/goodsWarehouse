<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/style.css">

    <title>GoodsWarehouse</title>
</head>
<body>

    <#--Header-->
    <nav class="nav">
        <a href="/" class="logo_text">GoodsWarehouse</a>
        <div class="right_nav">
            <ul class="mnu_top">
                <li><a href="/" class="down">Goods</a>
                    <ul class="mnu_sub">
                        <li><a href="/products/new">New good</a></li>
                    </ul>
                </li>
                <li><a href="/productTypes">Goods types</a></li>
                <li><a href="/providers" class="down">Providers</a>
                    <ul class="mnu_sub">
                        <li><a href="/providers/new">New provider</a></li>
                    </ul>
                </li>
                <li><a href="/invoices">Invoices</a></li>
                <li><a href="/productsLists" class="down">Orders</a>
                    <ul class="mnu_sub">
                        <li><a href="/productsLists/new">New order</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>

    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Change order</i></h1>

    <form action="/productsLists/${productsList.id}" method="post">
        <div style="margin-left: 30px"><i><b>Product: </b></i></div>
        <select name="product">
            <#list products as product>
                <option value="${product.id}">${product.title}</option>
            </#list>
        </select><br><br>

        <div style="margin-left: 30px"><i><b>Invoice: </b></i></div>
        <select name="invoice">
            <#list invoices as invoice>
                <option value="${invoice.id}">${invoice.number}</option>
            </#list>
        </select><br><br>

        <div style="margin-left: 30px"><i><b>Quantity: </b></i></div>
        <input type="text" name="quantity" value="${productsList.quantity}"/><br><br>

        <input type="submit" value="Update good"/>
    </form>
</body>
</html>