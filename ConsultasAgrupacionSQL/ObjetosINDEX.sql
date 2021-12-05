--INDEX
CREATE INDEX anual ON ventas (
strftime('%Y',fecha)>2020
)