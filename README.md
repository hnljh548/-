### 本工具类主要用于数据库中字典表和菜单表的批量国际化操作。

#### 1、菜单表国际化

1.1、menu表中添加trans_key字段，用于存储i18n配置文件的key

1.2、将menu_name从数据库中从第一个直接复制到最后一个，粘贴到翻译软件中，将中文name存一份txt，翻译后的英文存一份txt，

txt内容的格式应该是这样：![image-20240514150454944](C:\Users\admin\Desktop\笔记\image\image-20240514150454944.png)

1.3、使用MenuI18nUtil工具类，设置好文件路径，工具类会自动生成内容为key=value形式的两个txt文件。（key为英文翻译去空格、驼峰形式，value为英文翻译或中文翻译）

#### 2、字典表国际化

2.1、将数据库中dict_type、dict_code、dict_name以及翻译后的内容分别粘贴至四个txt文件，内容格式如上。

2.2、使用DictI18nUntil工具类，设置好文件路径，工具类会自动生成内容为key=value形式的两个txt文件。（key为dict_type.dict_code拼接而成，value为英文翻译或中文翻译）



#### 以上生成的txt文件内容可直接粘贴至i18n的properties配置文件中，手动去除重复的key=value。（idea会有重复提示）

#### 有疑问可邮箱至hnljh548@163.com

