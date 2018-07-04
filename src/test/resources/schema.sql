--
--
-- 文本编码：UTF-8
--
-- DROP TABLE IF EXISTS attach;
-- DROP TABLE IF EXISTS comments;
-- DROP TABLE IF EXISTS contents;
-- DROP TABLE IF EXISTS `logs`;
-- DROP TABLE IF EXISTS  metas;
-- DROP TABLE IF EXISTS  `options`;
-- DROP TABLE IF EXISTS relationships;
-- DROP TABLE IF EXISTS users;
-- 表：attach
DROP TABLE IF EXISTS attach;
CREATE TABLE `attach` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `fname` varchar(100) NOT NULL COMMENT '文件名称',
  `ftype` varchar(50) DEFAULT NULL COMMENT '文件类型',
  `fkey` varchar(100) NOT NULL COMMENT '文件key',
  `author_id` int(10) NOT NULL COMMENT '作者',
  `created` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表：comment
DROP TABLE IF EXISTS comment;
CREATE TABLE `comment` (
  `coid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` int(11) NOT NULL DEFAULT '0' COMMENT 'post表主键,关联字段',
  `created` datetime NOT NULL COMMENT '创建时间',
  `author` varchar(200) NOT NULL COMMENT '评论作者',
  `author_id` int(10) DEFAULT '0' COMMENT '评论所属用户id',
  `owner_id` int(10) DEFAULT '0' COMMENT '评论所属内容作者id',
  `mail` varchar(200) NOT NULL DEFAULT '' COMMENT '评论者邮件',
  `url` varchar(200) NOT NULL DEFAULT '' COMMENT '评论者网址',
  `ip` varchar(64) NOT NULL DEFAULT '' COMMENT '评论者ip地址',
  `agent` varchar(200) NOT NULL DEFAULT '' COMMENT '评论者客户端',
  `content` text NOT NULL COMMENT '评论内容',
  `type` varchar(16) DEFAULT NULL COMMENT '评论类型',
  `status` varchar(16) DEFAULT NULL COMMENT '评论状态',
  `parent` int(10) DEFAULT '0' COMMENT '父级评论',
  PRIMARY KEY (`coid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表：content
DROP TABLE IF EXISTS content;

CREATE TABLE `content` (
  `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章表主键',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `slug` varchar(255) NOT NULL DEFAULT '' COMMENT '缩略名',
  `thumb_img` varchar(255) NOT NULL DEFAULT '' COMMENT '文章缩略图',
  `created` datetime NOT NULL COMMENT '创建时间',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `content` text NOT NULL COMMENT '内容',
  `author_id` int(10) NOT NULL COMMENT '创建用户',
  `type` varchar(16) NOT NULL DEFAULT '' COMMENT '文章类型： PAGE、POST',
  `status` varchar(16) NOT NULL DEFAULT '' COMMENT '内容状态',
  `fmt_type` varchar(16) NOT NULL DEFAULT 'markdown' COMMENT '内容类型，markdown或者html',
  `tags` varchar(200) NOT NULL DEFAULT '' COMMENT '标签列表',
  `categories` varchar(200) NOT NULL DEFAULT '' COMMENT '分类列表',
  `hits` int(10) NOT NULL DEFAULT '0' COMMENT '文章点击次数',
  `comments_num` int(1) NOT NULL DEFAULT '0' COMMENT '内容所属评论数',
  `allow_comment` int(1) NOT NULL DEFAULT '1' COMMENT '是否允许评论',
  `allow_ping` int(1) NOT NULL DEFAULT '1' COMMENT '是否允许ping',
  `allow_feed` int(1) NOT NULL DEFAULT '1' COMMENT '允许出现在Feed中',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
INSERT INTO content (cid, title, slug, created, modified, content, author_id, type, STATUS, tags, categories, hits, comments_num, allow_comment, allow_ping, allow_feed) VALUES (1, '关于', 'about', now(), now(), '### Hello World

这是我的关于页面

### 当然还有其他

具体你来写点什么吧', 1, 'page', 'publish', '', '', 0, 0, 1, 1, 1);
INSERT INTO content (cid, title, slug, created, modified, content, author_id, type, STATUS, tags, categories, hits, comments_num, allow_comment, allow_ping, allow_feed) VALUES (2, '第一篇文章', '', now(), now(), '## Hello  World.

> 第一篇文章总得写点儿什么?...

----------


<!--more-->

```java
public static void main(String[] args){
    System.out.println(\"Hello Tale.\");
}
```', 1, 'post', 'publish', '', '默认分类', 10, 0, 1, 1, 1);

INSERT INTO content (allow_feed,allow_ping,allow_comment,comments_num,hits,
categories,tags,fmt_type,STATUS,type,author_id,content,modified,created,thumb_img,slug,title,cid) VALUES (
0,1,1,0,0,'','','markdown','publish','page',1,'## 友情链接

- :lock: [王爵的技术博客]()
- :lock: [cyang.tech]()
- :lock: [Bakumon''s Blog]()

## 链接须知

> 请确定贵站可以稳定运营
> 原创博客优先，技术类博客优先，设计、视觉类博客优先
> 经常过来访问和评论，眼熟的

备注：默认申请友情链接均为内页（当前页面）

## 基本信息

                网站名称：Tale博客
                网站地址：https://tale.biezhi.me

请在当页通过评论来申请友链，其他地方不予回复

暂时先这样，同时欢迎互换友链，这个页面留言即可。 ^_^

还有，我会不定时对无法访问的网址进行清理，请保证自己的链接长期有效。',now(),now(),'','links','友情链接',3);

-- 表：log
DROP TABLE IF EXISTS log;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `action` varchar(100) NOT NULL COMMENT '动作',
  `data` varchar(2000) NOT NULL DEFAULT '' COMMENT '数据',
  `author_id` int(10) NOT NULL COMMENT '发生人id',
  `ip` varchar(20) NOT NULL DEFAULT '' COMMENT 'ip',
  `created` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表：meta
DROP TABLE IF EXISTS meta;
CREATE TABLE `meta` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(200) NOT NULL COMMENT '项目名称',
  `slug` varchar(200) NOT NULL DEFAULT '' COMMENT '项目缩略名',
  `type` varchar(32) NOT NULL COMMENT '项目类型',
  `description` varchar(255) NOT NULL COMMENT '项目描述',
  `sort` int(4) NOT NULL DEFAULT '0' COMMENT '项目排序',
  `parent` int(10) DEFAULT '0' COMMENT '父级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
INSERT INTO meta (id, name, slug, type, description, sort, parent) VALUES (1, '默认分类', '', 'category', '', 0, 0);

-- 表：options
DROP TABLE IF EXISTS options;
CREATE TABLE `options` (
  `name` varchar(100) NOT NULL COMMENT '配置键',
  `VALUE` text COMMENT '配置值',
  `description` varchar(255) DEFAULT NULL COMMENT '配置描述',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO options (name, VALUE, description) VALUES ('site_title', 'Tale博客系统', '');
INSERT INTO options (name, VALUE, description) VALUES ('social_weibo', '', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('social_zhihu', '', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('social_github', '', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('social_twitter', '', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('allow_install', '0', '是否允许重新安装博客');
INSERT INTO options (name, VALUE, description) VALUES ('site_theme', 'default', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('site_keywords', '博客系统,Blade框架,Tale', NULL);
INSERT INTO options (name, VALUE, description) VALUES ('site_description', '博客系统,Blade框架,Tale', NULL);

-- 表：relationship
DROP TABLE IF EXISTS relationship;
CREATE TABLE `relationship` (
  `cid` int(10) NOT NULL COMMENT '文章主键',
  `mid` int(10) NOT NULL COMMENT '项目主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO relationship(cid, mid) VALUES(2, 1);

-- 表：user
DROP TABLE IF EXISTS user;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `email` varchar(100) NOT NULL DEFAULT '' COMMENT '邮箱',
  `home_url` varchar(255) NOT NULL DEFAULT '' COMMENT '网址',
  `screen_name` varchar(100) NOT NULL DEFAULT '' COMMENT '用户显示的名称',
  `created` datetime NOT NULL COMMENT '创建时间',
  `activated` datetime NOT NULL COMMENT '最后活动时间',
  `logged` datetime NOT NULL COMMENT '上次登录最后活跃时间',
  `group_name` varchar(16) NOT NULL DEFAULT '' COMMENT '用户组',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
