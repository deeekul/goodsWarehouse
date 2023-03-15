<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GoodsWarehouse</title>
    <link rel="stylesheet" href="/css/style.css">
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


    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Change provider</i></h1>

    <form action="/providers/${provider.id}" method="post">
        <div style="margin-left: 30px"><i><b>Name: </b></i></div>
        <input type="text" name="name" value="${provider.name}"/><br><br>

        <div style="margin-left: 30px"><i><b>Address: </b></i></div>
        <input type="text" name="address" size="40px" value="${provider.address}"/><br><br>

        <div style="margin-left: 30px"><i><b>Phone number: </b></i></div>
        <input type="text" name="phoneNumber" value="${provider.phoneNumber}"/><br><br>
        <input type="submit" value="Update provider"/>
    </form>
</body>
</html>