# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table activity (
  id                        bigint not null,
  user_id                   bigint,
  constraint pk_activity primary key (id))
;

create table activity_change (
  id                        bigint not null,
  activity_object_id        bigint,
  event_time                varchar(255),
  verb                      TEXT,
  activity_id               bigint,
  acted_id                  bigint,
  constraint pk_activity_change primary key (id))
;

create table activity_object (
  id                        bigint not null,
  object_type               varchar(255),
  identifier                varchar(255),
  constraint pk_activity_object primary key (id))
;

create table badge (
  id                        bigint not null,
  name                      TEXT,
  constraint pk_badge primary key (id))
;

create table chapter (
  id                        bigint not null,
  subject_id                bigint,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  status                    TEXT,
  video_url                 TEXT,
  next_chapter_id           bigint,
  previous_chapter_id       bigint,
  featured_image_id         bigint,
  constraint pk_chapter primary key (id))
;

create table chapter_edit_history (
  id                        bigint not null,
  subject_id                bigint,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  status                    TEXT,
  next_chapter_id           bigint,
  previous_chapter_id       bigint,
  featured_image_id         bigint,
  editor_id                 bigint,
  video_url                 TEXT,
  constraint pk_chapter_edit_history primary key (id))
;

create table concept (
  id                        bigint not null,
  chapter_id                bigint,
  status                    TEXT,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  video_url                 TEXT,
  next_concept_id           bigint,
  previous_concept_id       bigint,
  featured_image_id         bigint,
  constraint pk_concept primary key (id))
;

create table concept_edit_history (
  id                        bigint not null,
  user_id                   bigint,
  subject_id                bigint,
  chapter_id                bigint,
  next_concept_id           bigint,
  previous_concept_id       bigint,
  video_url                 TEXT,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  status                    TEXT,
  featured_image_id         bigint,
  editor_id                 bigint,
  constraint pk_concept_edit_history primary key (id))
;

create table downvote (
  id                        bigint not null,
  from_id                   bigint,
  short_note_id             bigint,
  created_time              varchar(255),
  constraint pk_downvote primary key (id))
;

create table flag (
  id                        bigint not null,
  short_note_id             bigint,
  flag_type                 varchar(13),
  user_id                   bigint,
  created_time              varchar(255),
  constraint ck_flag_flag_type check (flag_type in ('Duplicate','Opinionistic','Inappropriate','Spam')),
  constraint pk_flag primary key (id))
;

create table forum_answer (
  id                        bigint not null,
  created_by_id             bigint,
  created_time              varchar(255),
  forum_thread_id           bigint,
  slug                      varchar(255),
  text                      varchar(255),
  html                      varchar(255),
  constraint pk_forum_answer primary key (id))
;

create table forum_answer_like (
  id                        bigint not null,
  created_by_id             bigint,
  created_time              varchar(255),
  forum_answer_id           bigint,
  constraint pk_forum_answer_like primary key (id))
;

create table forum_thread (
  id                        bigint not null,
  created_by_id             bigint,
  created_time              varchar(255),
  title                     varchar(255),
  text                      varchar(255),
  slug                      varchar(255),
  html                      varchar(255),
  constraint pk_forum_thread primary key (id))
;

create table forum_thread_like (
  id                        bigint not null,
  created_by_id             bigint,
  created_time              varchar(255),
  forum_thread_id           bigint,
  constraint pk_forum_thread_like primary key (id))
;

create table image (
  id                        bigint not null,
  user_id                   bigint,
  file_name                 varchar(255),
  content_type              varchar(255),
  path                      varchar(255),
  created_time              varchar(255),
  height                    integer,
  width                     integer,
  alt                       varchar(255),
  description               varchar(255),
  caption                   varchar(255),
  title                     varchar(255),
  constraint pk_image primary key (id))
;

create table linked_account (
  id                        bigint not null,
  user_id                   bigint,
  provider_user_id          varchar(255),
  provider_key              varchar(255),
  constraint pk_linked_account primary key (id))
;

create table notification (
  id                        bigint not null,
  user_id                   bigint,
  constraint pk_notification primary key (id))
;

create table notification_info (
  id                        bigint not null,
  event_time                varchar(255),
  verb                      TEXT,
  is_seen                   boolean,
  acted_id                  bigint,
  notification_object_id    bigint,
  notification_id           bigint,
  constraint pk_notification_info primary key (id))
;

create table notification_object (
  id                        bigint not null,
  object_type               TEXT,
  identifier                varchar(255),
  constraint pk_notification_object primary key (id))
;

create table report (
  id                        bigint not null,
  short_note_id             bigint,
  flag_type                 varchar(13),
  user_id                   bigint,
  resolved                  boolean,
  helpful                   boolean,
  created_time              varchar(255),
  resolved_time             varchar(255),
  constraint ck_report_flag_type check (flag_type in ('Duplicate','Opinionistic','Inappropriate','Spam')),
  constraint pk_report primary key (id))
;

create table security_role (
  id                        bigint not null,
  role_name                 varchar(255),
  constraint pk_security_role primary key (id))
;

create table short_note (
  id                        bigint not null,
  user_id                   bigint,
  created_time              varchar(255),
  updated_time              varchar(255),
  title                     TEXT,
  slug                      TEXT,
  text                      TEXT,
  html                      TEXT,
  score                     int default 0,
  featured_image_id         bigint,
  constraint pk_short_note primary key (id))
;

create table short_note_edit_history (
  id                        bigint not null,
  shortnote_id              bigint,
  created_time              varchar(255),
  updated_time              varchar(255),
  title                     TEXT,
  slug                      TEXT,
  text                      TEXT,
  html                      TEXT,
  featured_image_id         bigint,
  editor_id                 bigint,
  constraint pk_short_note_edit_history primary key (id))
;

create table subject (
  id                        bigint not null,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  status                    TEXT,
  video_url                 TEXT,
  featured_image_id         bigint,
  constraint pk_subject primary key (id))
;

create table subject_edit_history (
  id                        bigint not null,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  status                    TEXT,
  featured_image_id         bigint,
  editor_id                 bigint,
  video_url                 TEXT,
  constraint pk_subject_edit_history primary key (id))
;

create table tag (
  id                        bigint not null,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  featured_image_id         bigint,
  constraint pk_tag primary key (id))
;

create table token_action (
  id                        bigint not null,
  token                     varchar(255),
  target_user_id            bigint,
  type                      varchar(2),
  created                   timestamp,
  expires                   timestamp,
  constraint ck_token_action_type check (type in ('PR','EV')),
  constraint uq_token_action_token unique (token),
  constraint pk_token_action primary key (id))
;

create table track (
  id                        bigint not null,
  user_id                   bigint,
  name                      TEXT,
  slug                      TEXT,
  description               TEXT,
  description_html          TEXT,
  constraint pk_track primary key (id))
;

create table users (
  id                        bigint not null,
  email                     varchar(255),
  name                      varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  last_login                timestamp,
  active                    boolean,
  email_validated           boolean,
  score                     integer,
  constraint pk_users primary key (id))
;

create table user_permission (
  id                        bigint not null,
  value                     varchar(255),
  constraint pk_user_permission primary key (id))
;

create table upvote (
  id                        bigint not null,
  from_id                   bigint,
  short_note_id             bigint,
  created_time              varchar(255),
  constraint pk_upvote primary key (id))
;


create table forum_thread_tag (
  forum_thread_id                bigint not null,
  tag_id                         bigint not null,
  constraint pk_forum_thread_tag primary key (forum_thread_id, tag_id))
;

create table short_note_tag (
  short_note_id                  bigint not null,
  tag_id                         bigint not null,
  constraint pk_short_note_tag primary key (short_note_id, tag_id))
;

create table short_note_edit_history_tag (
  short_note_edit_history_id     bigint not null,
  tag_id                         bigint not null,
  constraint pk_short_note_edit_history_tag primary key (short_note_edit_history_id, tag_id))
;

create table tag_chapter (
  tag_id                         bigint not null,
  chapter_id                     bigint not null,
  constraint pk_tag_chapter primary key (tag_id, chapter_id))
;

create table users_security_role (
  users_id                       bigint not null,
  security_role_id               bigint not null,
  constraint pk_users_security_role primary key (users_id, security_role_id))
;

create table users_user_permission (
  users_id                       bigint not null,
  user_permission_id             bigint not null,
  constraint pk_users_user_permission primary key (users_id, user_permission_id))
;

create table users_badge (
  users_id                       bigint not null,
  badge_id                       bigint not null,
  constraint pk_users_badge primary key (users_id, badge_id))
;

create table follower_map (
  userId                         bigint not null,
  followingId                    bigint not null,
  constraint pk_follower_map primary key (userId, followingId))
;

create table users_tag (
  users_id                       bigint not null,
  tag_id                         bigint not null,
  constraint pk_users_tag primary key (users_id, tag_id))
;
create sequence activity_seq;

create sequence activity_change_seq;

create sequence activity_object_seq;

create sequence badge_seq;

create sequence chapter_seq;

create sequence chapter_edit_history_seq;

create sequence concept_seq;

create sequence concept_edit_history_seq;

create sequence downvote_seq;

create sequence flag_seq;

create sequence forum_answer_seq;

create sequence forum_answer_like_seq;

create sequence forum_thread_seq;

create sequence forum_thread_like_seq;

create sequence image_seq;

create sequence linked_account_seq;

create sequence notification_seq;

create sequence notification_info_seq;

create sequence notification_object_seq;

create sequence report_seq;

create sequence security_role_seq;

create sequence short_note_seq;

create sequence short_note_edit_history_seq;

create sequence subject_seq;

create sequence subject_edit_history_seq;

create sequence tag_seq;

create sequence token_action_seq;

create sequence track_seq;

create sequence users_seq;

create sequence user_permission_seq;

create sequence upvote_seq;

alter table activity add constraint fk_activity_user_1 foreign key (user_id) references users (id);
create index ix_activity_user_1 on activity (user_id);
alter table activity_change add constraint fk_activity_change_activityObj_2 foreign key (activity_object_id) references activity_object (id);
create index ix_activity_change_activityObj_2 on activity_change (activity_object_id);
alter table activity_change add constraint fk_activity_change_activity_3 foreign key (activity_id) references activity (id);
create index ix_activity_change_activity_3 on activity_change (activity_id);
alter table activity_change add constraint fk_activity_change_acted_4 foreign key (acted_id) references users (id);
create index ix_activity_change_acted_4 on activity_change (acted_id);
alter table chapter add constraint fk_chapter_subject_5 foreign key (subject_id) references subject (id);
create index ix_chapter_subject_5 on chapter (subject_id);
alter table chapter add constraint fk_chapter_nextChapter_6 foreign key (next_chapter_id) references chapter (id);
create index ix_chapter_nextChapter_6 on chapter (next_chapter_id);
alter table chapter add constraint fk_chapter_previousChapter_7 foreign key (previous_chapter_id) references chapter (id);
create index ix_chapter_previousChapter_7 on chapter (previous_chapter_id);
alter table chapter add constraint fk_chapter_featuredImage_8 foreign key (featured_image_id) references image (id);
create index ix_chapter_featuredImage_8 on chapter (featured_image_id);
alter table chapter_edit_history add constraint fk_chapter_edit_history_subjec_9 foreign key (subject_id) references subject (id);
create index ix_chapter_edit_history_subjec_9 on chapter_edit_history (subject_id);
alter table chapter_edit_history add constraint fk_chapter_edit_history_nextC_10 foreign key (next_chapter_id) references chapter (id);
create index ix_chapter_edit_history_nextC_10 on chapter_edit_history (next_chapter_id);
alter table chapter_edit_history add constraint fk_chapter_edit_history_previ_11 foreign key (previous_chapter_id) references chapter (id);
create index ix_chapter_edit_history_previ_11 on chapter_edit_history (previous_chapter_id);
alter table chapter_edit_history add constraint fk_chapter_edit_history_featu_12 foreign key (featured_image_id) references image (id);
create index ix_chapter_edit_history_featu_12 on chapter_edit_history (featured_image_id);
alter table chapter_edit_history add constraint fk_chapter_edit_history_edito_13 foreign key (editor_id) references users (id);
create index ix_chapter_edit_history_edito_13 on chapter_edit_history (editor_id);
alter table concept add constraint fk_concept_chapter_14 foreign key (chapter_id) references chapter (id);
create index ix_concept_chapter_14 on concept (chapter_id);
alter table concept add constraint fk_concept_nextConcept_15 foreign key (next_concept_id) references concept (id);
create index ix_concept_nextConcept_15 on concept (next_concept_id);
alter table concept add constraint fk_concept_previousConcept_16 foreign key (previous_concept_id) references concept (id);
create index ix_concept_previousConcept_16 on concept (previous_concept_id);
alter table concept add constraint fk_concept_featuredImage_17 foreign key (featured_image_id) references image (id);
create index ix_concept_featuredImage_17 on concept (featured_image_id);
alter table concept_edit_history add constraint fk_concept_edit_history_user_18 foreign key (user_id) references users (id);
create index ix_concept_edit_history_user_18 on concept_edit_history (user_id);
alter table concept_edit_history add constraint fk_concept_edit_history_subje_19 foreign key (subject_id) references subject (id);
create index ix_concept_edit_history_subje_19 on concept_edit_history (subject_id);
alter table concept_edit_history add constraint fk_concept_edit_history_chapt_20 foreign key (chapter_id) references chapter (id);
create index ix_concept_edit_history_chapt_20 on concept_edit_history (chapter_id);
alter table concept_edit_history add constraint fk_concept_edit_history_nextC_21 foreign key (next_concept_id) references concept (id);
create index ix_concept_edit_history_nextC_21 on concept_edit_history (next_concept_id);
alter table concept_edit_history add constraint fk_concept_edit_history_previ_22 foreign key (previous_concept_id) references concept (id);
create index ix_concept_edit_history_previ_22 on concept_edit_history (previous_concept_id);
alter table concept_edit_history add constraint fk_concept_edit_history_featu_23 foreign key (featured_image_id) references image (id);
create index ix_concept_edit_history_featu_23 on concept_edit_history (featured_image_id);
alter table concept_edit_history add constraint fk_concept_edit_history_edito_24 foreign key (editor_id) references users (id);
create index ix_concept_edit_history_edito_24 on concept_edit_history (editor_id);
alter table downvote add constraint fk_downvote_from_25 foreign key (from_id) references users (id);
create index ix_downvote_from_25 on downvote (from_id);
alter table downvote add constraint fk_downvote_shortNote_26 foreign key (short_note_id) references short_note (id);
create index ix_downvote_shortNote_26 on downvote (short_note_id);
alter table flag add constraint fk_flag_shortNote_27 foreign key (short_note_id) references short_note (id);
create index ix_flag_shortNote_27 on flag (short_note_id);
alter table flag add constraint fk_flag_user_28 foreign key (user_id) references users (id);
create index ix_flag_user_28 on flag (user_id);
alter table forum_answer add constraint fk_forum_answer_createdBy_29 foreign key (created_by_id) references users (id);
create index ix_forum_answer_createdBy_29 on forum_answer (created_by_id);
alter table forum_answer add constraint fk_forum_answer_forumThread_30 foreign key (forum_thread_id) references forum_thread (id);
create index ix_forum_answer_forumThread_30 on forum_answer (forum_thread_id);
alter table forum_answer_like add constraint fk_forum_answer_like_createdB_31 foreign key (created_by_id) references users (id);
create index ix_forum_answer_like_createdB_31 on forum_answer_like (created_by_id);
alter table forum_answer_like add constraint fk_forum_answer_like_forumAns_32 foreign key (forum_answer_id) references forum_answer (id);
create index ix_forum_answer_like_forumAns_32 on forum_answer_like (forum_answer_id);
alter table forum_thread add constraint fk_forum_thread_createdBy_33 foreign key (created_by_id) references users (id);
create index ix_forum_thread_createdBy_33 on forum_thread (created_by_id);
alter table forum_thread_like add constraint fk_forum_thread_like_createdB_34 foreign key (created_by_id) references users (id);
create index ix_forum_thread_like_createdB_34 on forum_thread_like (created_by_id);
alter table forum_thread_like add constraint fk_forum_thread_like_forumThr_35 foreign key (forum_thread_id) references forum_thread (id);
create index ix_forum_thread_like_forumThr_35 on forum_thread_like (forum_thread_id);
alter table image add constraint fk_image_user_36 foreign key (user_id) references users (id);
create index ix_image_user_36 on image (user_id);
alter table linked_account add constraint fk_linked_account_user_37 foreign key (user_id) references users (id);
create index ix_linked_account_user_37 on linked_account (user_id);
alter table notification add constraint fk_notification_user_38 foreign key (user_id) references users (id);
create index ix_notification_user_38 on notification (user_id);
alter table notification_info add constraint fk_notification_info_acted_39 foreign key (acted_id) references users (id);
create index ix_notification_info_acted_39 on notification_info (acted_id);
alter table notification_info add constraint fk_notification_info_notifica_40 foreign key (notification_object_id) references notification_object (id);
create index ix_notification_info_notifica_40 on notification_info (notification_object_id);
alter table notification_info add constraint fk_notification_info_notifica_41 foreign key (notification_id) references notification (id);
create index ix_notification_info_notifica_41 on notification_info (notification_id);
alter table report add constraint fk_report_shortNote_42 foreign key (short_note_id) references short_note (id);
create index ix_report_shortNote_42 on report (short_note_id);
alter table report add constraint fk_report_user_43 foreign key (user_id) references users (id);
create index ix_report_user_43 on report (user_id);
alter table short_note add constraint fk_short_note_user_44 foreign key (user_id) references users (id);
create index ix_short_note_user_44 on short_note (user_id);
alter table short_note add constraint fk_short_note_featuredImage_45 foreign key (featured_image_id) references image (id);
create index ix_short_note_featuredImage_45 on short_note (featured_image_id);
alter table short_note_edit_history add constraint fk_short_note_edit_history_sh_46 foreign key (shortnote_id) references short_note (id);
create index ix_short_note_edit_history_sh_46 on short_note_edit_history (shortnote_id);
alter table short_note_edit_history add constraint fk_short_note_edit_history_fe_47 foreign key (featured_image_id) references image (id);
create index ix_short_note_edit_history_fe_47 on short_note_edit_history (featured_image_id);
alter table short_note_edit_history add constraint fk_short_note_edit_history_ed_48 foreign key (editor_id) references users (id);
create index ix_short_note_edit_history_ed_48 on short_note_edit_history (editor_id);
alter table subject add constraint fk_subject_featuredImage_49 foreign key (featured_image_id) references image (id);
create index ix_subject_featuredImage_49 on subject (featured_image_id);
alter table subject_edit_history add constraint fk_subject_edit_history_featu_50 foreign key (featured_image_id) references image (id);
create index ix_subject_edit_history_featu_50 on subject_edit_history (featured_image_id);
alter table subject_edit_history add constraint fk_subject_edit_history_edito_51 foreign key (editor_id) references users (id);
create index ix_subject_edit_history_edito_51 on subject_edit_history (editor_id);
alter table tag add constraint fk_tag_featuredImage_52 foreign key (featured_image_id) references image (id);
create index ix_tag_featuredImage_52 on tag (featured_image_id);
alter table token_action add constraint fk_token_action_targetUser_53 foreign key (target_user_id) references users (id);
create index ix_token_action_targetUser_53 on token_action (target_user_id);
alter table track add constraint fk_track_user_54 foreign key (user_id) references users (id);
create index ix_track_user_54 on track (user_id);
alter table upvote add constraint fk_upvote_from_55 foreign key (from_id) references users (id);
create index ix_upvote_from_55 on upvote (from_id);
alter table upvote add constraint fk_upvote_shortNote_56 foreign key (short_note_id) references short_note (id);
create index ix_upvote_shortNote_56 on upvote (short_note_id);



alter table forum_thread_tag add constraint fk_forum_thread_tag_forum_thr_01 foreign key (forum_thread_id) references forum_thread (id);

alter table forum_thread_tag add constraint fk_forum_thread_tag_tag_02 foreign key (tag_id) references tag (id);

alter table short_note_tag add constraint fk_short_note_tag_short_note_01 foreign key (short_note_id) references short_note (id);

alter table short_note_tag add constraint fk_short_note_tag_tag_02 foreign key (tag_id) references tag (id);

alter table short_note_edit_history_tag add constraint fk_short_note_edit_history_ta_01 foreign key (short_note_edit_history_id) references short_note_edit_history (id);

alter table short_note_edit_history_tag add constraint fk_short_note_edit_history_ta_02 foreign key (tag_id) references tag (id);

alter table tag_chapter add constraint fk_tag_chapter_tag_01 foreign key (tag_id) references tag (id);

alter table tag_chapter add constraint fk_tag_chapter_chapter_02 foreign key (chapter_id) references chapter (id);

alter table users_security_role add constraint fk_users_security_role_users_01 foreign key (users_id) references users (id);

alter table users_security_role add constraint fk_users_security_role_securi_02 foreign key (security_role_id) references security_role (id);

alter table users_user_permission add constraint fk_users_user_permission_user_01 foreign key (users_id) references users (id);

alter table users_user_permission add constraint fk_users_user_permission_user_02 foreign key (user_permission_id) references user_permission (id);

alter table users_badge add constraint fk_users_badge_users_01 foreign key (users_id) references users (id);

alter table users_badge add constraint fk_users_badge_badge_02 foreign key (badge_id) references badge (id);

alter table follower_map add constraint fk_follower_map_users_01 foreign key (userId) references users (id);

alter table follower_map add constraint fk_follower_map_users_02 foreign key (followingId) references users (id);

alter table users_tag add constraint fk_users_tag_users_01 foreign key (users_id) references users (id);

alter table users_tag add constraint fk_users_tag_tag_02 foreign key (tag_id) references tag (id);

# --- !Downs

drop table if exists activity cascade;

drop table if exists activity_change cascade;

drop table if exists activity_object cascade;

drop table if exists badge cascade;

drop table if exists chapter cascade;

drop table if exists chapter_edit_history cascade;

drop table if exists concept cascade;

drop table if exists concept_edit_history cascade;

drop table if exists downvote cascade;

drop table if exists flag cascade;

drop table if exists forum_answer cascade;

drop table if exists forum_answer_like cascade;

drop table if exists forum_thread cascade;

drop table if exists forum_thread_tag cascade;

drop table if exists forum_thread_like cascade;

drop table if exists image cascade;

drop table if exists linked_account cascade;

drop table if exists notification cascade;

drop table if exists notification_info cascade;

drop table if exists notification_object cascade;

drop table if exists report cascade;

drop table if exists security_role cascade;

drop table if exists short_note cascade;

drop table if exists short_note_tag cascade;

drop table if exists short_note_edit_history cascade;

drop table if exists short_note_edit_history_tag cascade;

drop table if exists subject cascade;

drop table if exists subject_edit_history cascade;

drop table if exists tag cascade;

drop table if exists tag_chapter cascade;

drop table if exists token_action cascade;

drop table if exists track cascade;

drop table if exists users cascade;

drop table if exists users_security_role cascade;

drop table if exists users_user_permission cascade;

drop table if exists users_badge cascade;

drop table if exists follower_map cascade;

drop table if exists users_tag cascade;

drop table if exists user_permission cascade;

drop table if exists upvote cascade;

drop sequence if exists activity_seq;

drop sequence if exists activity_change_seq;

drop sequence if exists activity_object_seq;

drop sequence if exists badge_seq;

drop sequence if exists chapter_seq;

drop sequence if exists chapter_edit_history_seq;

drop sequence if exists concept_seq;

drop sequence if exists concept_edit_history_seq;

drop sequence if exists downvote_seq;

drop sequence if exists flag_seq;

drop sequence if exists forum_answer_seq;

drop sequence if exists forum_answer_like_seq;

drop sequence if exists forum_thread_seq;

drop sequence if exists forum_thread_like_seq;

drop sequence if exists image_seq;

drop sequence if exists linked_account_seq;

drop sequence if exists notification_seq;

drop sequence if exists notification_info_seq;

drop sequence if exists notification_object_seq;

drop sequence if exists report_seq;

drop sequence if exists security_role_seq;

drop sequence if exists short_note_seq;

drop sequence if exists short_note_edit_history_seq;

drop sequence if exists subject_seq;

drop sequence if exists subject_edit_history_seq;

drop sequence if exists tag_seq;

drop sequence if exists token_action_seq;

drop sequence if exists track_seq;

drop sequence if exists users_seq;

drop sequence if exists user_permission_seq;

drop sequence if exists upvote_seq;

