do $$ begin
 if exists (select * from pg_available_extensions where name='pg_stat_statements')
  then create extension if not exists pg_stat_statements;
 end if;
end $$ ;;
