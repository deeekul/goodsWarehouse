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
                <li><a href="/products" class="down">Goods</a>
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

    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Create a new order</i></h1>

    <form action="/productsLists/create" method="post">
        <select name="product">
            <#list products as product>
                <option value="none" selected disabled hidden>Select a product</option>
                <option value="${product.id}">${product.title} (${product.provider.getName()})</option>
            </#list>
        </select><br/><br/>

        <select name="invoice">
            <#list invoices as invoice>
                <option value="none" selected disabled hidden>Select number of an invoice</option>
                <option value="${invoice.id}">${invoice.number}</option>
            </#list>
        </select><br/><br/>

        <input placeholder="Quantity" type="number" name="quantity" required/><br><br>
        <input type="submit" value="Create order"/>
    </form>

</body>
</html>
