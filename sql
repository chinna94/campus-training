use sag;
SELECT * FROM accidents  ORDER BY A desc  limit 3;
SELECT * FROM accidents  ORDER BY B desc  limit 3;
SELECT * FROM accidents  ORDER BY C desc  limit 3;
SELECT * FROM accidents  ORDER BY D desc  limit 3;
SELECT * FROM accidents  ORDER BY E desc  limit 3;
SELECT * FROM accidents  ORDER BY F desc  limit 3;
SELECT * FROM accidents  ORDER BY G desc  limit 3;

SELECT  a.States ,a.A/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.A/b.A) DESC limit 3;
SELECT  a.States ,a.B/b.A  FROM accidents a,population b WHERE a.States=b.States Order BY (a.B/b.A) DESC limit 3;
SELECT  a.States ,a.C/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.C/b.A) DESC limit 3;
SELECT  a.States ,a.D/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.D/b.A) DESC limit 3;
SELECT  a.States ,a.E/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.E/b.A) DESC limit 3;
SELECT  a.States ,a.F/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.F/b.A) DESC limit 3;
SELECT  a.States ,a.G/b.A FROM accidents a,population b WHERE a.States=b.States Order BY (a.G/b.A) DESC limit 3;
SELECT  a.States ,(a.G/b.A)*(c.A/1000) FROM accidents a,vehicle_counts b,population c WHERE a.States=b.States Order BY (a.G/b.A)*(c.A/1000) DESC limit 1;
SELECT  a.States ,(a.F/b.B)*(c.A/1000) FROM accidents a,vehicle_counts b,population c WHERE a.States=b.States Order BY (a.F/b.B)*(c.A/1000) DESC limit 1;

