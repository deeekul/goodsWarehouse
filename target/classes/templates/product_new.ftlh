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

    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Create a new good</i></h1>

    <form action="/products/create" method="post" enctype="multipart/form-data">
        <select name="type">
            <#list product_types as product_type>
                <option value="none" selected disabled hidden>Select a product type</option>
                <option value="${product_type.id}" >${product_type.name}</option>
            </#list>
        </select><br/><br/>
        <input placeholder="Name" type="text" name="title" required/><br><br>
        <input placeholder="Description" type="text" name="description" required/><br><br>
        <input placeholder="Unit price" type="number" name="unitPrice" min="0"/><br><br>
        <select name="provider">
            <#list providers as provider>
                <option value="none" selected disabled hidden>Select a provider</option>
                <option value="${provider.id}">${provider.name}</option>
            </#list>
        </select><br/><br/>

        <label class="custom-file-upload">
            <input type="file" name="file1"/>
            Add an image
        </label>
        <label class="custom-file-upload">
            <input type="file" name="file2"/>
            Add an image
        </label>
        <label class="custom-file-upload">
            <input type="file" name="file3"/>
            Add an image
        </label>
        <input type="submit" value="Create good"/>
    </form>
</body>
</html>