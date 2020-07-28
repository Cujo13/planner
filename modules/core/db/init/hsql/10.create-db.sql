-- begin PLANNER_SPEAKER
create table PLANNER_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255) not null,
    LASTNAME varchar(255),
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end PLANNER_SPEAKER
-- begin PLANNER_SESSION_TYPE
create table PLANNER_SESSION_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end PLANNER_SESSION_TYPE
-- begin PLANNER_SESSION
create table PLANNER_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    TYPE_ varchar(255),
    START_DATE timestamp not null,
    DURATION integer not null,
    SPEAKER_ID varchar(36) not null,
    DESCRIPTION longvarchar,
    --
    primary key (ID)
)^
-- end PLANNER_SESSION
